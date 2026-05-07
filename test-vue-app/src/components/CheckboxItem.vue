<template>
  <li><input type="checkbox" :checked="checked" />{{ name }}</li>
</template>
<script>
export default {
  name: 'CheckboxItem',
  props: {
    id: [Number, String],
    name: String,
    checked: {
      type: Boolean,
      required: false,
      default: false,
    },
  },

  //속성 유효성 추가 전
  // props: ['name', 'checked'],

  //자식 컴포넌트에게 props 옵션 정의 전
  // data() {
  //   return {
  //     checked: false,
  //   };
  // },
};
</script>
