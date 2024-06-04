import { useEffect, useState } from 'react';
import { SpinnerLoading } from '../../utils/SpinnerLoading';
import VehicleModel from '../../../models/VehicleModel';
import { Pagination } from '../../utils/Pagination';

export const PopularAds=()=>{

    const [vehicles, setVehicles]=useState<VehicleModel[]>([]);
    const [isLoading, setIsLoading]=useState(true);
    const [httpError, setHttpError]=useState(null);
    const [currentPage, setCurrentPage]=useState(1);
    const [vehiclesPerPage]=useState(5);
    const [totalAmountOfVehicles, setTotalAmountOfVehicles]=useState(0);
    const [totalPages, setTotalPages]=useState(0);
    const [search, setSearch]=useState('');
    const [searchUrl, setSearchUrl]=useState('');
    const [categorySelection, setCategorySelection]=useState('Book category');


    useEffect(()=>{
        const fetchVehicles=async()=>{
          const url:string="http://localhost:8080/api/vehicles/search/findByPromoted?promoted=yes&page=0&size=20";
          
          const response=await fetch(url);
          if(!response.ok){
              throw new Error("Something went wrong!");
          }
          const responseJson=await response.json();
          const responseData=responseJson._embedded.vehicles;
          setTotalAmountOfVehicles(responseJson.page.totalElements);
          setTotalPages(responseJson.page.totalPages);
  
          const loadedVehicles:VehicleModel[]=[];
          for(const key in responseData){
              loadedVehicles.push(
                  {
                      id:responseData[key].id,
                      make:responseData[key].make,
                      model:responseData[key].model,
                      year:responseData[key].year,
                      userEmail:responseData[key].userEmail,
                      description:responseData[key].description,
                      price:responseData[key].price,
                      colour:responseData[key].colour,
                      vehicleCondition:responseData[key].vehicleCondition,
                    gearType:responseData[key].gearType,
                    engineSize:responseData[key].engineSize,
                    category:responseData[key].category,
                    noOfViews:responseData[key].noOfViews,
                    promoted:responseData[key].promoted,
                    durationOfAds:responseData[key].durationOfAds,
                    image:responseData[key].image
  
                  }
              );
          }
          setVehicles(loadedVehicles);
          setIsLoading(false);
        };
        fetchVehicles().catch((error:any)=>{
          setIsLoading(false);
          setHttpError(error.message);
        });
        window.scrollTo(0,0);
      }, [currentPage, searchUrl]);


      if(isLoading){
        return(
          <SpinnerLoading/>
        )
    }

    if(httpError){
        return(
           <div className="container m-5">
              <p>{httpError}</p>
           </div>
        )
    }

    
    const indexOfLastVehicle:number=currentPage*vehiclesPerPage;
    const indexOfFirstBook:number=indexOfLastVehicle-vehiclesPerPage;
    let lastItem=vehiclesPerPage*currentPage<=totalAmountOfVehicles?
                 vehiclesPerPage*currentPage:totalAmountOfVehicles;

                 const paginate=(pageNumber:number)=>setCurrentPage(pageNumber);

    return(
        <div className="col-sm-9">
        <div><h1 className="fs-6">Popular Ads</h1></div>
        <div className="row row-cols-4 gy-3">
        
{vehicles.map(vehicle=>(
    

                         vehicle.image?
                         <div className="col">
                         <img src={vehicle.image}
                          width='123'
                          height='196'
                          alt="Book"
                         />
                         </div>
                         :
                         <></>
))   
                    }
                    
                        
                    {
        totalPages>1&&
        <Pagination currentPage={currentPage} totalPages={totalPages}
                    paginate={paginate}/>
    } 
          </div>
         
        
      </div>
      
    );
}