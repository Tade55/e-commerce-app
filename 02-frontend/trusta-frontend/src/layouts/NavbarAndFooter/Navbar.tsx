export const Navbar = () => {
  return (
    <nav className="navbar navbar-expand-lg">
      <div className="container-fluid">
      <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
       </button>
        <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <ul className="navbar-nav ms-2 me-auto mb-2 mb-lg-0">
            <a href="#">
            <img src={require('./../../Images/trusta-logo/trusta-Logo.jpg')}
                width='120'
                height='100'/>
            </a>
            <div className="text-center py-5 ms-2"><a href="#">About us</a></div>

          </ul>
          
          <div className="px-1"><h4>Trusta! Your leading market place</h4></div>

          
            <li className="nav-item dropdown nav-link active ms-auto " aria-current="page" >
              <a
                className="nav-link dropdown-toggle"
                href="#"
                role="button"
                data-bs-toggle="dropdown"
                aria-expanded="false"
              >
               
              <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" fill="currentColor" className="bi bi-person button-with-space" viewBox="0 0 16 16">
              <path d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6m2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0m4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4m-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10s-3.516.68-4.168 1.332c-.678.678-.83 1.418-.832 1.664z"/>
              </svg>
              
              </a>
              <ul className="dropdown-menu">
                <li>
                  <a className="dropdown-item" href="#">
                    Sign-in
                  </a>
                </li>
                <li>
                  <a className="dropdown-item" href="#">
                    My Ads
                  </a>
                </li>
              </ul>
            </li>
          
        </div>
        <button type="button" className="btn btn-warning ms-5">SELL</button>
      </div>  
    </nav>
    
  );
};    
                
           

          
