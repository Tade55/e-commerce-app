import { Footer } from "../NavbarAndFooter/Footer";
import { ExploreProductsAndServices } from "./Components/ExploreProductsAndServices";
import { Overview } from "./Components/Overview";

export const HomePage=()=>{
    return(
       <>
         <Overview/>
         <ExploreProductsAndServices/>
       </>
    );
}