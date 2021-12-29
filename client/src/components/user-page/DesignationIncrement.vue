<template lang="html">
  <div class="inherit-all">
    <div
      class="form-group row"
      v-for="(designation, k) in user.designations"
      :key="k"
    >
      <label for="designation title">Designation </label>
      <v-text-field
        v-model="designation.title"
        id="user.designation.title"
        name="user.designation.title"
      />
      <label for="effective from">Effective from</label>
      <Date
        @DateChangeEvent="$event => (designation.effectiveFrom = $event)"
      ></Date>

      <v-btn class="addbutton" small right @click="add('designations')"
        >ADD</v-btn
      >
      <v-btn
        class="removebutton"
        small
        right
        @click="remove('designations', k)"
        v-show="k || (!k && user.assets.length > 1)"
        >Remove</v-btn
      >
    </div>
    <div
      class="form-group row"
      v-for="(designation, k) in user.designations"
      :key="k"
    >
      <label for="designation title">Designation </label>
      <v-text-field
        v-model="designation.title"
        id="user.designation.title"
        name="user.designation.title"
      />
      <label for="effective from">Effective from</label>
      <Date
        @DateChangeEvent="$event => (designation.effectiveFrom = $event)"
      ></Date>

      <v-btn class="addbutton" small right @click="add('designations')"
        >ADD</v-btn
      >
      <v-btn
        class="removebutton"
        small
        right
        @click="remove('designations', k)"
        v-show="k || (!k && user.assets.length > 1)"
        >Remove</v-btn
      >
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
