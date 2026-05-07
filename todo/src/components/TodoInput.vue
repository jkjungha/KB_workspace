<script>
export default {
  // 입력 받을 데이터 정의
  data() {
    return {
      inputMsg: '',
    };
  },
  methods: {
    addTodo() {
      this.$emit('add-todo', this.inputMsg);
      this.inputMsg = '';
    },
  },
  emits: ['add-todo'],
};
</script>
<template>
  <div class="todo__input">
    <!-- 입력창 v-model 데이터 바인딩 -->
    <!-- 엔터 입력 시 이벤트 등록 -->
    <input
      type="text"
      class="todo__input-text"
      placeholder="할 일을 입력하세요."
      v-model="inputMsg"
      @keydown.enter="addTodo"
    />
    <!-- 버튼 클릭 시 이벤트 등록 -->
    <button class="todo__input-btn" @click="addTodo">등록</button>
  </div>
</template>
