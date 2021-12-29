<template>
  <div class="jumbotron">
    <div class="container">
      <div class="row">
        <div class="col-sm-8 offset-sm-2">
          <div>
            <h2 style="text-align: center;">Add Qentellect</h2>
            <form @submit.prevent="handleSubmit">
              <v-expansion-panels>
                <v-expansion-panel>
                  <v-expansion-panel-header>Intro</v-expansion-panel-header>
                  <v-expansion-panel-content>
                    <intro :user="user" />
                  </v-expansion-panel-content>
                </v-expansion-panel>
                <v-expansion-panel>
                  <v-expansion-panel-header>Workplace</v-expansion-panel-header>
                  <v-expansion-panel-content>
                    <workplace :user="user" :departments="getDepartments" />
                  </v-expansion-panel-content>
                </v-expansion-panel>
              </v-expansion-panels>

              <div class="form-group ">
                <div
                  v-if="submitted && !$v.user.deskNo.required"
                  class="invalid-feedback error_class"
                >
                  Desk num required
                </div>
              </div>
              <div class="form-group row">
                <label for="Locker no">Locker No.</label>
                <v-autocomplete
                  :items="LockNO"
                  v-model="user.lockerNo"
                  label="Locker NO"
                ></v-autocomplete>
              </div>
              <div
                class="form-group row"
                v-for="(asset, k) in user.assets"
                :key="k"
              >
                <label for="email">Asset type</label>
                <v-text-field
                  type="text"
                  v-model="asset.assetType"
                  id="email"
                  name="email"
                />
                <label for="email">Asset ID</label>
                <v-text-field
                  type="text"
                  v-model="asset.assetNo"
                  id="email"
                  name="email"
                />
                <v-btn class="addbutton" small right @click="add('assets')"
                  >ADD</v-btn
                >
                <v-btn
                  class="removebutton"
                  small
                  right
                  @click="remove('assets', k)"
                  v-show="k || (!k && user.assets.length > 1)"
                  >Remove</v-btn
                >
              </div>
              <div class="form-group row">
                <label for="accessCardNo">Access card No.</label>
                <v-text-field
                  type="text"
                  v-model="user.accessCardNo"
                  id="password"
                  name="accessCardNo"
                />
                <label for="email">Email</label>
                <v-text-field
                  type="email"
                  v-model="user.emailId"
                  id="emailId"
                  name="emailId"
                  class="form-control"
                  :rules="validation.emailRules"
                  required
                />
                <!-- <div  v-if="submitted && !$v.user.emailId.required" class="invalid-feedback error_class">First Name is required</div>-->
              </div>
              <div class="form-group row">
                <label for="profilePicId">Experience</label>
                <v-text-field
                  v-model="user.experience"
                  id="experience"
                  name="experience"
                />
              </div>

              <div v-for="(skill, k) in user.skills" :key="k">
                <div class="form-group row">
                  <label for="name">Skills</label>
                  <v-text-field
                    v-model="skill.name"
                    id="user.designation.title"
                    name="user.designation.title"
                  />
                  <label for="Certification">Certification</label>
                  <v-text-field
                    accept="number"
                    v-model.number="skill.certification"
                    id="user.designation.title"
                    name="user.designation.title"
                  />
                </div>
                <div class="form-group row">
                  <label for="teach">Teach</label>
                  <v-select
                    :items="choose"
                    label="teach"
                    @change="skillchange('teach', k, $event)"
                  ></v-select>
                  <label for="Like to work">Like to work</label>
                  <v-select
                    :items="choose"
                    label="teach"
                    @change="skillchange('likeToWork', k, $event)"
                  ></v-select>
                  <v-btn class="addbutton" small right @click="add('skills')"
                    >ADD</v-btn
                  >
                  <v-btn
                    class="removebutton"
                    small
                    right
                    @click="remove('skills', k)"
                    v-show="k || (!k && user.skills.length > 1)"
                    >Remove</v-btn
                  >
                </div>
              </div>
              <div class="form-group">
                <v-btn type="submit" style="margin-left=190px"
                  >Submit Qentellect</v-btn
                >
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script lang="js">

import { mapActions } from 'vuex'
import {mapGetters} from 'vuex'
import Intro from "../components/user-page/Intro.vue";
import Workplace from "../components/user-page/Workplace.vue";
  export default  {

    props: [],
    components:{

      Workplace,
      Intro
        },

    mounted () {
    console.log(this.$v)
    },
    created(){
      this.gettingDepartments();
      for(let i=0;i<500;i++){
         this.LockNO.push(i)
       }
    },
    data () {
      return {
        validation :{
         emailRules: [
        v => !!v || 'E-mail is required',
        v => /.+@.+/.test(v) || 'E-mail must be valid',
      ],
        },

        user: {
          "deskNo": '',
          "lockerNo": 201,
          "assets": [{ "assetType": "", "assetNo": "" }],
          "accessCardNo": "",
          "emailId": "",
          "designations": [{ "title": "SE", "effectiveFrom": "2020-01-02" }],
          "departments": [
            { "departmentID": 1, "startDate": "2010-02-12", "endDate": "2020-01-02" }
          ],
          "skills": [
            { "name": "", "certification": "", "teach": 1, "likeToWork": 1 }
          ],
          "shift": { "name": "day" },
          "salary": {
            "currentSalary": 1000,
            "increments": [
              { "percentage": 10, "effectiveFrom": "2019-02-02" },
              { "percentage": 30, "effectiveFrom": "2020-04-02" }
            ]
          },
          "awards": [1, 2],
          "experience": "",
          "lnd":[{"name":"java","status":"pending"},{"name":"Spring","status":"pending"}],
          "responsibilities": ["AC remote operator", "water supplier"],
          "bandwidth": 1
        },
        submitted: false,
        choose:['yes','no'],
        DeskNO:[],
        LockNO:[]
      }

    },
    methods: {
       handleSubmit() {
                this.submitted = true;

                // stop here if form is invalid
                this.$v.$touch();
                if (this.$v.$invalid) {
                  console.log("touchedddddddddd")
                    return;
                }

               this.postusers(this.user)
            },
      skillchange(val,i,event){
        console.log(val,i,event)
        if(event=="yes" && val=="teach"){
          this.user.skills[i].teach=true
        }else if(event=="yes" && val=="likeToWork"){
          this.user.skills[i].likeToWork=true
        }else if(event=="no" && val=="teach"){
            this.user.skills[i].teach=false
        }else{
          this.user.skills[i].likeToWork=false
        }
      },

      departmentchange(i,val){
        this.user.departments[i].departmentID+=this.getDepartments.indexOf(val)
        console.log(this.getDepartments.indexOf(val))
      },
      ...mapActions(['postusers','gettingDepartments']),
      remove(key,index){
         switch(key){
         case "skills" :
                   this.user.skills.splice(index, 1);
                    break;
          case "assets" :
                    this.user.assets.splice(index, 1);
                     break;
            case "designations":
                       this.user.designations.splice(index, 1);
                       break;
            case "department":
                       this.user.departments.splice(index, 1);
                         break;
           default:
                         break;
       }

      },
      add(key){
       switch(key){
         case "skills" :
                   this.user.skills.push( { name: "", certification:  "", teach: "", likeToWork: "" })
                    break;
          case "assets" :
                     this.user.assets.push({assetType:"",assetNo:""})
                     console.log(this.user)
                     break;
            case "designations":
                       this.user.designations.push({title:"",effectiveFrom: ""})
                       break;
            case "department":
                       this.user.departments.push({departmentId : this.user.departments.length+1,startDate : "",endDate: ""})
                         break;
           default:
                         break;
       }

        console.log(this.user)
      }
    },

    computed: {
       ...mapGetters(['getDepartments']),


    },
    validations:{
     /* user: {
          deskNo: {
            required
          },
          // lockerNo: {
          //   required
          // },
          // assets: {
          //   $each:{
          //     assetType: {
          //         required
          //         },
          //       assetNo: {
          //           required
          //         }
          //       }
          // },
          // accessCardNo: {
          //   required
          // },
          emailId: {
            required
          },
          // profilePicId: {
          //   required
          // },
    //       designations: {
    //         $each:{
    //           title: {
    //             required
    //           },
    //           effectiveFrom: {
    //             required
    //           }
    //         }
    //       },
    //       departments: {
    //         $each:{
    //           departmentId: {
    //             required
    //           },
    //           startDate: {
    //             required
    //           },
    //           endDate: {
    //             required
    //           }
    //         }
    //       },
    //       skills: {
    //         $each: {
    //           "name": {
    //             required
    //           },
    //           "certification": {
    //             required
    //           },
    //           "teach": {
    //             required
    //           },
    //           "likeToWork": {
    //             required
    //           }
    //         }
    //       },
    //       "shift": {
    //         "name": {
    //           required
    //         }
    //        },
    //       "salary": {
    //         "currentSalary": {required},
    //         "increments": {
    //           $each:{
    //             "percentage": {
    //               required
    //             },
    //             "effectiveFrom": {required}
    //              }
    //         }

    //       }
    //       ,
    //       "experience": {
    //         required
    //       },
    //       "lnd": {
    //         required
    //       },
    //       "responsibilities":{
    //         required
    //       },
    //       "bandwidth": {
    //         required
    //       }
    //   }
    // }
}*/
}
}
</script>

<style scoped lang="scss">
.error_class {
  align-self: flex-end;
  margin-left: -156px;
}

.profile-image {
  height: 80px;
  width: 80px;
  border-radius: 50%;
}
label {
  align-self: center;
  margin-inline-end: 10px;
  margin-inline-start: 10px;
}
.addbutton {
  align-self: center;
  margin-inline-start: 16px;
}
.removebutton {
  margin-top: 20px;
  margin-left: 10px;
}
</style>
