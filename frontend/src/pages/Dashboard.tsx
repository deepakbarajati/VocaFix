import { Link } from "react-router-dom";

const Dashboard = () => {
  return (
    <div className="flex flex-col items-center justify-center min-h-screen bg-gray-200">
      <h1 className="text-3xl font-bold mb-4">Dashboard</h1>
      <p className="mb-4">Choose an action below:</p>
      <div className="flex space-x-4">
        <Link to="/upload" className="bg-green-500 text-white px-4 py-2 rounded">Upload Video</Link>
        <Link to="/transcription" className="bg-yellow-500 text-white px-4 py-2 rounded">View Transcription</Link>
        <Link to="/correction" className="bg-red-500 text-white px-4 py-2 rounded">View Correction</Link>
      </div>
    </div>
  );
};

export default Dashboard;
