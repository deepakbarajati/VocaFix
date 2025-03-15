import { useState } from "react";
import { uploadVideo } from "../api";

const VideoUpload = () => {
  const [file, setFile] = useState<File | null>(null);
  const [message, setMessage] = useState("");

  const handleUpload = async () => {
    if (!file) return;

    const formData = new FormData();
    formData.append("file", file);

    try {
      const response = await uploadVideo(formData);
      setMessage(`Uploaded! Video ID: ${response.data.id}`);
    } catch (error) {
      setMessage("Upload failed!");
    }
  };

  return (
    <div className="p-4">
      <input type="file" onChange={(e) => setFile(e.target.files?.[0] || null)} />
      <button onClick={handleUpload} className="bg-blue-500 text-white p-2">Upload</button>
      <p>{message}</p>
    </div>
  );
};

export default VideoUpload;
