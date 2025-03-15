import axios from "axios";

const API_BASE_URL = "http://localhost:8080/api";

export const uploadVideo = (formData: FormData) => {
  return axios.post(`${API_BASE_URL}/videos/upload`, formData);
};

export const getTranscription = (videoId: string) => {
  return axios.get(`${API_BASE_URL}/transcription/${videoId}`);
};

export const getCorrection = (transcriptionId: string) => {
  return axios.get(`${API_BASE_URL}/correction/${transcriptionId}`);
};
