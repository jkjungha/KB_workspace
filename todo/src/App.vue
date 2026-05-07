<script>
import TodoHeader from './components/TodoHeader.vue';
import TodoList from './components/TodoList.vue';
import TodoInput from './components/TodoInput.vue';
export default {
  data() {
    return {
      todo: [],
      current: 'all',
    };
  },
  components: { TodoHeader, TodoList, TodoInput },
  methods: {
    addTodo(inputMsg) {
      const item = {
        id: Math.random(),
        msg: inputMsg,
        completed: false,
      };
      this.todo.push(item);
    },
    updateTab(tab) {
      this.current = tab;
    },
  },
  computed: {
    computedTodo() {
      if (this.current === 'all') {
        return this.todo;
      } else {
        return this.todo.filter((v) => v.completed);
      }
    },
  },
};
</script>

<template>
  <div class="todo">
    <TodoHeader :current="current" @update-tab="updateTab" />
    <TodoList :computed-todo="computedTodo" />
    <TodoInput @add-todo="addTodo" />
  </div>
</template>

<style scoped></style>
