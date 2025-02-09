import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import HomePage from "./pages/HomePage";
// import { Box } from "@mui/material";

export const PrivatePaths = {
};

export const PublicPaths = {
  home: '/'
};

function AppRoutes() {
  return (
    <Router>
          <Routes>
            {/* Public Routes */}
            <Route path={PublicPaths.home} element={<HomePage />} />
          </Routes>
    </Router>
  );
}

export default AppRoutes;
