export interface Quote {
  quoteId: string;
  certificateNo: string;
  customerId: string;
  premiumAmount: number;
  status: string;
  version: number;
  createdAt: string;
  updatedAt: string;
}

export interface Policy {
  policyId: string;
  certificateNo: string;
  customerId: string;
  coverageAmount: number;
  status: string;
  version: number;
  createdAt: string;
  updatedAt: string;
}

export interface Claim {
  claimId: string;
  policyId: string;
  claimAmount: number;
  status: string;
  version: number;
  createdAt: string;
  updatedAt: string;
}

export interface Customer {
  customerId: string;
  name: string;
  email: string;
  phone: string;
  createdAt: string;
}

export interface Agency {
  agencyId: string;
  name: string;
  code: string;
  createdAt: string;
}

export interface User {
  userId: string;
  username: string;
  role: string;
  createdAt: string;
}

export interface ApiResponse<T> {
  success: boolean;
  message: string;
  data: T;
  timestamp: string;
}
