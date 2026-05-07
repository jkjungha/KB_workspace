<script>
export default {
  props: {
    computedTodo: {
      type: Array,
      default() {
        return [];
      },
    },
  },
};
</script>
<template>
  <div class="todo__list">
    <!-- 할 일 목록이 있을 때 (완료 시 .todo__item--completed 클래스 추가 )-->
    <div
      v-for="item in computedTodo"
      :key="item.id"
      class="todo__item"
      :class="{ 'todo__item--completed': item.completed }"
    >
      <input type="checkbox" id="chk" />
      <label for="chk" class="todo__checkbox-label"></label>
      <span class="todo__item-text">{{ item.msg }}</span>
      <span class="material-symbols-outlined todo__delete-icon"> delete </span>
    </div>
    <!-- 할 일 목록이 없을 때 -->
    <div v-if="computedTodo.length === 0" class="todo__item--no">
      <p>할일 목록이 없습니다.</p>
    </div>
  </div>
</template>
