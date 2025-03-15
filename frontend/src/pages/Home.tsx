import { Link } from "react-router-dom";

const Home = () => {
  return (
    <div className="flex flex-col items-center justify-center min-h-screen bg-gray-100">
      <h1 className="text-4xl font-bold mb-6">Welcome to VocaFix</h1>
      <p className="text-lg mb-4">Upload videos, transcribe speech, and correct text easily.</p>
      <div className="space-x-4">
        <Link to="/dashboard" className="bg-blue-500 text-white px-4 py-2 rounded">Go to Dashboard</Link>
      </div>
    </div>
  );
};

export default Home;
