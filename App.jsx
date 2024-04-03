import { useState } from "react";
import Button from "./Button";
import AddTodo from "./components/AddTodo";
import AppName from "./components/AppName";
import Singletodo from "./components/Singletodo";
function App() {
  let [todolist, settodolist] = useState([]);

  let handleadd = (todoname, tododate) => {
    let newtodo = [
      ...todolist,
      {
        name: todoname,
        date: tododate,
      },
    ];
    settodolist(newtodo);
  };
  let handledelete = (item) => {
    const newlist = todolist.filter((citem) => citem !== item);
    settodolist(newlist);
  };
  console.log(todolist);
  return (
    <>
      <center>
        <AppName />
        <AddTodo handleadd={handleadd} />
        {todolist.map((item) => (
          <Singletodo
            key={item.name}
            name={item.name}
            date={item.date}
            handledelete={() => handledelete(item)}
          />
        ))}
      </center>
    </>
  );
}

export default App;
