import { Link } from "react-router-dom";

export const Footer=()=>{
    return(
        <div className="footer-color">
            <footer className=" d-flex flex-wrap justify-content-between
            align-items-center main-color pt-5">
               <div className="container text-center">
  <div className="row row-cols-4">
    <div className="col">
        <h5>Contact us</h5>
        <h6 className="text-white"><Link to="/" className="nav-link px-2 text-white">
                         Live Chat
                        </Link></h6>
                        <h6 className="text-white"><Link to="/" className="nav-link px-2 text-white">
                         email placeholder
                        </Link></h6>
    </div>
    <div className="col">
    <h5>Our Resources</h5>
        <h6 className="text-white"><Link to="/" className="nav-link px-2 text-white">
                         Our FB
                        </Link></h6>
                        <h6 className="text-white"><Link to="/" className="nav-link px-2 text-white">
                         Our Twitter
                        </Link></h6>
                        <h6 className="text-white"><Link to="/" className="nav-link px-2 text-white">
                         Our Youtube
                        </Link></h6>
                        <h6 className="text-white"><Link to="/" className="nav-link px-2 text-white">
                         Our Instagram
                        </Link></h6>
    </div>
    <div className="col">
        <h5>Our App</h5>
        <h6 className="text-white"><Link to="/" className="nav-link px-2 text-white">
                         On Apps store
                        </Link></h6>
                        <h6 className="text-white"><Link to="/" className="nav-link px-2 text-white">
                         On Google play
                        </Link></h6>
    </div>
    <div className="col">
    <h5>Quick Links</h5>
        <h6 className="text-white"><Link to="/" className="nav-link px-2 text-white">
                         About us
                        </Link></h6>
                        <h6 className="text-white"><Link to="/" className="nav-link px-2 text-white">
                         Log-in
                        </Link></h6>
                        <h6 className="text-white"><Link to="/" className="nav-link px-2 text-white">
                         Sign-up
                        </Link></h6>
    </div>
  </div>
</div>
                <div className="container text-center">
  <div className="row row-cols-1 pt-5">
    <h6 className="text-white">&#169; All rights reserved</h6>
  </div>
</div>
            </footer>

        </div>
    );
}