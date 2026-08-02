# Insurance Core DynamoDB Mini-App

A monorepo for an insurance core application built with a Spring Boot 4 / Java 21 backend and a Vue 3 + TypeScript frontend, showcasing DynamoDB Single Table Design with immutable versioning and dual API implementations.

## Monorepo Architecture

- **`backend/`**: Spring Boot 4 + Java 21 REST API with dual DynamoDB implementations.
  - `/api/v1/**`: Uses low-level `DynamoDbClient` (manual `AttributeValue` mapping).
  - `/api/v2/**`: Uses `DynamoDbEnhancedClient` (`@DynamoDbBean`, `TableSchema`, `DynamoDbTable<T>`).
- **`frontend/`**: Vue 3 + TypeScript + Vite web application using Pinia, Vue Router, and Axios.

---

## Single Table Design (`InsuranceCoreTable`)

### Primary Key Catalog
| Entity | PK Format | SK Format | Notes |
| :--- | :--- | :--- | :--- |
| **Quote** | `QUOTE#{quoteId}` | `V#0` or `V#{n}` | Versioned entity |
| **Policy** | `POLICY#{policyId}` | `V#0` or `V#{n}` | Versioned entity |
| **Claim** | `CLAIM#{claimId}` | `V#0` or `V#{n}` | Versioned entity |
| **Customer** | `CUSTOMER#{customerId}` | `METADATA` | Non-versioned |
| **Agency** | `AGENCY#{agencyId}` | `METADATA` | Non-versioned |
| **User** | `USER#{userId}` | `METADATA` | Non-versioned |

### Sparse GSIs
- **GSI1** (Certificate Lookup & User Listing):
  - Quote V#0: `GSI1PK=CERT#{certificateNo}`, `GSI1SK=QUOTE#{quoteId}`
  - Policy V#0: `GSI1PK=CERT#{certificateNo}`, `GSI1SK=POLICY#{policyId}`
  - User: `GSI1PK=USERS`, `GSI1SK=USER#{userId}`
- **GSI2** (Parent-Child Hierarchy):
  - Policy V#0: `GSI2PK=CUSTOMER#{customerId}`, `GSI2SK=POLICY#{createdAt}#{policyId}`
  - Claim V#0: `GSI2PK=POLICY#{policyId}`, `GSI2SK=CLAIM#{createdAt}#{claimId}`

### Versioning Rule
- `V#0`: Latest mirror of an entity, overwritten on every mutation.
- `V#1`, `V#2`...: Immutable historical snapshots, strictly increasing.
- Every mutation uses `TransactWriteItems` writing both the `V#{n}` snapshot and updating `V#0` with `latestVersion=n`.

---

## Getting Started

### 1. Start DynamoDB Local
```bash
docker-compose up -d
```
DynamoDB Local will run at `http://localhost:8000`.

### 2. Backend Setup
```bash
cd backend
mvn clean spring-boot:run
```
The backend server runs on `http://localhost:8080`.

### 3. Frontend Setup
```bash
cd frontend
npm install
npm run dev
```
The frontend dev server runs on `http://localhost:5173`.
