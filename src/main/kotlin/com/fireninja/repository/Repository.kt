package com.fireninja.repository

import com.fireninja.models.Todo
import com.fireninja.models.User
import com.fireninja.service.todo.params.EditTodoParams
import com.fireninja.service.todo.params.NewTodoParams
import com.fireninja.service.user.params.RegisterUserParams
import com.fireninja.service.user.params.LoginUserParams

interface Repository {
  suspend fun registerUser(params: RegisterUserParams): User
  suspend fun loginUser(params: LoginUserParams): User
  fun addTodo(
    params: NewTodoParams,
    userId: Int,
  ): Todo

  fun getTodosByUserId(userId: Int): List<Todo>
  fun getTodoById(todoId: Int): Todo
  fun editTodo(
    params: EditTodoParams,
    userId: Int,
  ): Todo

  fun deleteTodo(todoInt: Int): Boolean
}