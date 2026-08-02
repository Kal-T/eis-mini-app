import { createRouter, createWebHistory } from 'vue-router';
import HomeView from '@/views/HomeView.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView,
    },
    {
      path: '/quotes',
      name: 'quotes',
      component: () => import('@/views/QuotesView.vue'),
    },
    {
      path: '/policies',
      name: 'policies',
      component: () => import('@/views/PoliciesView.vue'),
    },
    {
      path: '/claims',
      name: 'claims',
      component: () => import('@/views/ClaimsView.vue'),
    },
  ],
});

export default router;
