import { useState } from "react";
import { getCorrection } from "../api";

const Correction = () => {
  const [transcriptionId, setTranscriptionId] = useState("");
  const [correctedText, setCorrectedText] = useState("");

  const fetchCorrection = async () => {
    try {
      const response = await getCorrection(transcriptionId);
      setCorrectedText(response.data.correctedText);
    } catch (error) {
      setCorrectedText("Failed to fetch correction.");
    }
  };

  return (
    <div className="p-4">
      <input type="text" placeholder="Enter Transcription ID" onChange={(e) => setTranscriptionId(e.target.value)} />
      <button onClick={fetchCorrection} className="bg-red-500 text-white p-2">Get Correction</button>
      <p>{correctedText}</p>
    </div>
  );
};

export default Correction;
