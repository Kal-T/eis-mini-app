import axios from 'axios';

const apiV1Base = import.meta.env.VITE_API_V1_BASE || 'http://localhost:8080/api/v1';
const apiV2Base = import.meta.env.VITE_API_V2_BASE || 'http://localhost:8080/api/v2';

export const v1Client = axios.create({
  baseURL: apiV1Base,
  headers: {
    'Content-Type': 'application/json',
  },
});

export const v2Client = axios.create({
  baseURL: apiV2Base,
  headers: {
    'Content-Type': 'application/json',
  },
});

export const getApiClient = (version: 'v1' | 'v2' = 'v1') => {
  return version === 'v1' ? v1Client : v2Client;
};
