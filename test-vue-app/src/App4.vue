<script>
import InputName from './components/InputName.vue';
export default {
  name: 'App4',
  components: { InputName },
  data() {
    return {
      parentName: '',
    };
  },
  methods: {
    nameChangedHander(e) {
      this.parentName = e.name;
    },
  },
};
</script>
<template>
  <div>
    <InputName @nameChanged="nameChangedHander" />
    <br />
    <h3>App 데이터 : {{ parentName }}</h3>
  </div>
</template>
