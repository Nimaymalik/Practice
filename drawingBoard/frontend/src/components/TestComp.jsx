import { Tldraw } from "tldraw";
import "tldraw/tldraw.css";
function TestComp() {

  return (
    <div style={{ position: "fixed", inset: 0 }}>
      {/* persitent key helps to keep the data on the refresh it stores it in the indexDb  */}
      <Tldraw persistenceKey="example" />
    </div>
  );
}

export default TestComp;
