import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";
Vue.use(Vuex);
const baseUrl = "http://localhost:8089/";
export default new Vuex.Store({
  state: {
    users: [],
    departments: []
  },
  mutations: {
    setUsers(state, data) {
      state.users = data;
    },
    setDepartments(state, data) {
      state.departments = data;
      console.log("state", state.departments);
    },
    adduser(state, data) {
      state.users.push(data);
    }
  },
  actions: {
    gettingUsers({ commit }) {
      axios.get(baseUrl + "employee/getEmployees").then(res => {
        commit("setUsers", res.data);
        return res.data;
      });
    },
    gettingDepartments({ commit }) {
      axios.get(baseUrl + "department/getDepartments").then(res => {
        commit("setDepartments", res.data);

        return res.data;
      });
    },
    postusers: function({ commit }, payLoad) {
      console.log("posting", payLoad);
      axios
        .post(baseUrl + "employee/createEmployee", payLoad)
        .then(res => {
          commit("adduser", res);
          return res;
        })
        .catch(err => {
          console.log(err);
        });
    }
  },
  modules: {},
  getters: {
    getUsers: state => state.users,
    getDepartments: state =>
      state.departments.map(function(i) {
        return i.name;
      })
  }
});
