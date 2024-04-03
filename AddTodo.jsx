import { useState,useRef } from "react";
import { MdAddBox } from "react-icons/md";
function AddTodo(props) {

  const todoname=useRef();
  const tododate=useRef();

  let handleadd = (event) => {
    event.preventDefault();
    props.handleadd(todoname.current.value, tododate.current.value);
    todoname.current.value="";
    tododate.current.value="";
  };

  return (
    <div className="container text-center">
      <form action="" className="row kg-row" onSubmit={handleadd}>
        <div className="col-6">
          <input
            type="text"
            placeholder="Enter Todo Here"
            ref={todoname}
          />
        </div>
        <div className="col-4">
          <input
            type="date"
            ref={tododate}
          />
        </div>
        <div className="col-2">
          <button type="submit" className="btn btn-success kg-button">
            <MdAddBox />
          </button>
        </div>
      </form>
    </div>
  );
}

export default AddTodo;
