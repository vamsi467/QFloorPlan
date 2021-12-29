<template>
  <div>
    <v-menu
      v-model="menu2"
      :close-on-content-click="false"
      :nudge-right="40"
      transition="scale-transition"
      offset-y
      min-width="290px"
    >
      <template v-slot:activator="{ on }">
        <v-text-field v-model="date" readonly v-on="on"></v-text-field>
      </template>
      <v-date-picker
        v-model="date"
        @input="dateChangeEvent(date)"
        no-title
      ></v-date-picker>
    </v-menu>
  </div>
</template>

<script>
export default {
  name: "Date",
  props: {},
  data() {
    return {
      date: "",
      menu2: false,

      range: {
        startDate: "2020-01-10",
        endDate: "2020-02-03"
      },
      selectedDates: []
    };
  },
  computed: {
    setDateRange() {
      return `${this.range.startDate} To ${this.range.endDate}`;
    }
  },
  methods: {
    dateRangeInit() {
      this.selectedDates = [];
    },
    dateChangeEvent(date) {
      this.$emit("DateChangeEvent", date);
      this.menu2 = false;
    }
  }
};
</script>

<style lang="scss" scoped></style>
