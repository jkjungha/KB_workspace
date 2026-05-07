<!-- 입력창에 할일을 입력하고 enter를 누르거나, 등록 버튼을 클릭했을 때 입력한 내용이 저장되어야 한다. 
 1. 사용자가 어떤 값을 입력했는지 알기 위해서 데이터를 정의해야한다.
 2. v-model 디렉티브 입력창과 양방향 데이터 바인딩을 처리해야한다.
 3. 입력창에서 enter나 등록 버튼을 클릭하면 사용자가 어떤 값을 입력했는지 이벤트를 등록하자 -->
<script>
export default {
  data() {
    return {
      inputMsg: '', //입력 todo 데이터 정의
    };
  },
  methods: {
    addTodo() {
      //  console.log(this.inputMsg); //할일 출력
      this.$emit('addTodo', this.inputMsg); // 부모 컴포넌트 이벤트 호출
      this.inputMsg = ''; //입력 데이터 초기화. 왜? 문자열이라서 계속 추가되니까...
    },
  },
  emits: ['addTodo'],
};
</script>
<template>
  <div class="todo__input">
    <!-- 정의한 inputMsg를 양방향 데이터 바인딩 -->
    <input
      type="text"
      class="todo__input-text"
      placeholder="할 일을 입력하세요."
      v-model="inputMsg"
      @keydown.enter="addTodo"
    />
    <button class="todo__input-btn" @click="addTodo">등록</button>
  </div>
</template>
