import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    redirect: {
    name: 'FloorMap',
    }
  },
  {
    path:'/floormap',
    name:'FloorMap',
    component: () => {import(/* webpackChunkName: "about" */ '../views/FloorMap.vue')}
  },
  {
    path: '/adduser',
    name: 'Adduser',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/Adduser.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
