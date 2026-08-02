<template>
  <header class="header-nav">
    <div class="brand">Insurance Core</div>
    <nav>
      <router-link to="/">Home</router-link>
      <router-link to="/quotes">Quotes</router-link>
      <router-link to="/policies">Policies</router-link>
      <router-link to="/claims">Claims</router-link>
    </nav>
    <div class="version-toggle">
      <label>API Mode: </label>
      <select v-model="appStore.activeApiVersion">
        <option value="v1">V1 (DynamoDbClient)</option>
        <option value="v2">V2 (DynamoDbEnhancedClient)</option>
      </select>
    </div>
  </header>
</template>

<script setup lang="ts">
import { useAppStore } from '@/stores/appStore';

const appStore = useAppStore();
</script>

<style scoped>
.header-nav {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 1rem 2rem;
  background-color: #1e293b;
  color: #f8fafc;
}
.brand {
  font-weight: bold;
  font-size: 1.25rem;
}
nav a {
  color: #cbd5e1;
  margin-right: 1rem;
  text-decoration: none;
}
nav a.router-link-exact-active {
  color: #38bdf8;
  font-weight: 600;
}
</style>
