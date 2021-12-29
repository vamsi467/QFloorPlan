<template lang="html">
  <div class="inherit-all">
    <label for="desk no">Workspace</label>
    <v-autocomplete
      :items="DeskNO"
      v-model="user.workplace"
      label="DESK NO"
    ></v-autocomplete>
    <label for="desk no">Desk / Room</label>
    <v-autocomplete
      :items="DeskNO"
      v-model="user.deskNo"
      label="DESK NO"
    ></v-autocomplete>
    <div
      class="form-group row"
      v-for="(department, k) in user.departments"
      :key="k"
    >
      <label for="desk no">Department</label>
      <v-select
        :items="departments"
        @change="departmentchange(k, $event)"
      ></v-select>
      <label for="start date">Start date</label>
      <Date @DateChangeEvent="$event => (department.startDate = $event)"></Date>
      <label for="end date">End date</label>
      <Date @DateChangeEvent="$event => (department.endDate = $event)"></Date>
      <v-btn class="addbutton" small right @click="add('department')"
        >ADD</v-btn
      >
      <v-btn
        class="removebutton"
        small
        right
        @click="remove('department', k)"
        v-show="k || (!k && user.departments.length > 1)"
        >Remove</v-btn
      >
      <label for="end date">Contribution</label>
      <v-checkbox></v-checkbox>
    </div>
  </div>
</template>

<script lang="js">
import Date from './Date'
export default {
    name: 'workspace',
    props: {
      user: Object,
      departments: Array
    },
    mounted() {

    },
    components:{
      Date
    },
    created(){
      for(let i=0;i<337;i++){
         this.DeskNO.push(i)
       }
       this.DeskNO.push("Sanjay","Prasanna","Rashi","vp room 1","vp room 2","vp room 3","vp room 4","vp room 5","vp room 6",
"executive cabin1", "executive cabin2", "executive cabin3")
    },
    data() {
        return {
          DeskNO: []
        }
    },
    methods: {
      onfilechange(event){
        let reader = new FileReader(); // HTML5 FileReader API
        let file = event.target.files[0];
        if (event.target.files && event.target.files[0]) {
          reader.readAsDataURL(file);

      // When file uploads set it to file formcontrol
          reader.onload = () => {
            this.user.profilePicId = reader.result;
            console.log(this.src)
          }
        }
      }
    },
    computed: {}
}
</script>

<style lang="scss" scoped></style>
