import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import Dashboard from "./pages/Dashboard";
import VideoUpload from "./components/VideoUpload";
import Transcription from "./components/Transcription";
import Correction from "./components/Correction";

const App = () => {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/dashboard" element={<Dashboard />} />
        <Route path="/upload" element={<VideoUpload />} />
        <Route path="/transcription" element={<Transcription />} />
        <Route path="/correction" element={<Correction />} />
      </Routes>
    </Router>
  );
};

export default App;
