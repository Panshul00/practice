import { MdDelete } from "react-icons/md";

function Singletodo(props) {
  return (
    <div className="container text-center">
      <div className="row kg-row">
        <div className="col-6">
          {props.name} 
        </div>
        <div className="col-4">
          {props.date}
        </div>
        <div className="col-2">
          <button type="button" className="btn btn-success kg-button" onClick={props.handledelete}>
            <MdDelete/>
          </button>
        </div>
      </div>
    </div>
  );
}

export default Singletodo;