import { defineStore } from 'pinia';
import { ref } from 'vue';

export const useAppStore = defineStore('app', () => {
  const activeApiVersion = ref<'v1' | 'v2'>('v1');

  function setApiVersion(version: 'v1' | 'v2') {
    activeApiVersion.value = version;
  }

  return {
    activeApiVersion,
    setApiVersion,
  };
});
