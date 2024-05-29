import React from "react";
import "./App.css";
import { Navbar } from "./layouts/NavbarAndFooter/Navbar";
import { HomePage } from "./layouts/HomePage/HomePage";
import { Route, Switch } from "react-router-dom";
import { Footer } from "./layouts/NavbarAndFooter/Footer";


export const App = () => {
  return (
    <div className="d-flex flex-column min-vh-100">
      <Navbar />
      <div className="flex-grow-1">
        <Switch>
      <Route path='/' exact>
      <HomePage />
      </Route>
      </Switch>
      </div>
      <Footer/>
    </div>
  );
};
