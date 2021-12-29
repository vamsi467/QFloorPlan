<template lang="html">
  <div class="inherit-all">
    <a href="#">{{ deskNumber }}</a>
    <user-details :users="users" />
  </div>
</template>

<script lang="js">
import UserDetails from "@components/home/details.vue"
export default {
    name: 'desk',
    props: {
      deskNumber:String,
      users: Array
    },
    mounted() {

    },
    components:{
      UserDetails
        },
    data() {
        return {

        }
    },
    methods: {
        adduser() {
            this.$router.push("Adduser")
        }
    },
    computed: {

    }
}
</script>

<style lang="scss" scoped>
.inherit-all {
  all: inherit;

  margin: 5px 2px;
  width: 30px;
  height: 30px;
  border: 1px solid #d6d6d6;
  text-align: center;
  border-radius: 4px;
  position: relative;
  display: inline-block;

  &:hover {
    .details {
      display: block;
    }
  }

  a {
    display: flex;
    justify-content: center;
    font-size: 11px;
    color: #9c9c9c;
    line-height: 30px;
    font-weight: 600;
    text-decoration: none;
  }

  .details {
    position: absolute;
    display: none;
    background-color: #f3f3f3;
    min-width: 200px;
    z-index: 2;
    font-size: 13px;
    text-align: justify;
    padding: 10px;

    span,
    a {
      display: block;
      line-height: normal;
      font-weight: normal;
    }

    a {
      font-size: 13px;
    }

    span {
      padding-top: 10px;
    }
  }
}
</style>
