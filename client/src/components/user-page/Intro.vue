<template lang="html">
  <div class="inherit-all">
    <img
      :src="user.profilePicId"
      type="file"
      class="profile-image"
      @click="$refs.file.click()"
      width="100"
      height="100"
    />
    <input
      type="file"
      ref="file"
      style="display: none"
      accept="image/*"
      @change="onfilechange($event)"
    />
  </div>
</template>

<script lang="js">
export default {
    name: 'intro',
    props: {
      user: Object
    },
    mounted() {

    },
    components:{},
    data() {
        return {

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
