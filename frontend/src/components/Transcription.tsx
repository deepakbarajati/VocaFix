import { useState } from "react";
import { getTranscription } from "../api";

const Transcription = () => {
  const [videoId, setVideoId] = useState("");
  const [transcription, setTranscription] = useState("");

  const fetchTranscription = async () => {
    try {
      const response = await getTranscription(videoId);
      setTranscription(response.data.text);
    } catch (error) {
      setTranscription("Failed to fetch transcription.");
    }
  };

  return (
    <div className="p-4">
      <input type="text" placeholder="Enter Video ID" onChange={(e) => setVideoId(e.target.value)} />
      <button onClick={fetchTranscription} className="bg-green-500 text-white p-2">Get Transcription</button>
      <p>{transcription}</p>
    </div>
  );
};

export default Transcription;
