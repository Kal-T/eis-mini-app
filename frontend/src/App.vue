<template>
  <div id="app-container">
    <HeaderNav />
    <main>
      <router-view />
    </main>
  </div>
</template>

<script setup lang="ts">
import HeaderNav from '@/components/HeaderNav.vue';
</script>

<style>
#app-container {
  font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, sans-serif;
  min-height: 100vh;
}
main {
  padding: 1rem 2rem;
}
</style>
