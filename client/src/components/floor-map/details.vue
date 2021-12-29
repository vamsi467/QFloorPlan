<template lang="html">
  <div>
    <v-flex class="details">
      <div v-for="(user, i) in users" :key="i">
        <v-card class="mx-auto">
          <v-img class="profile-image" :src="user.profilePicId"></v-img>
          <h3>
            {{ user.emailId }}
          </h3>
          <span
            style="margin-left:15px"
            v-for="(skill, i) in user.skills"
            :key="i"
          >
            {{ skill.name }}
          </span>
        </v-card>
        <!-- <a href="#">{{ user.emailId }}</a>
        <span v-for="(skill, i) in user.skills" :key="i">{{ skill.name }}</span> -->
      </div>
    </v-flex>
  </div>
</template>

<script lang="js">
export default {
    name: 'user-details',
    props: {
        users: Array
    },
    mounted() {

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
.profile-image {
  margin-left: 30px;
  height: 80px;
  width: 80px;
}
.floor-map {
  background-color: #f5f5f5;
  padding: 10px;
  &__team {
    &--seat {
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
  }
  &__center-sitting {
    padding-right: 60px;
  }
  &__last-sitting {
    margin-top: -120px;
  }
  &__ahu-room {
    padding-left: 200px;
  }
  &__lab-room {
    margin-top: -100px;
  }
  &--rooms {
    min-height: 100px;
    align-items: center;
    display: flex;
    margin: 2px;
    justify-content: center;
    background-color: #ffffff;
    &.small-room {
      min-height: 50px;
    }
    .icons {
      text-align: center;
      i {
        font-size: 30px;
        &.fa-vials {
          color: #ff7600;
        }
        &.fa-table-tennis {
          color: #3570dc;
        }
      }
      small {
        font-size: 16px;
        font-weight: 600;
        display: block;
      }
    }
  }
}
</style>
