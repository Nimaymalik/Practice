import Test from "./pages/Test";
import Realtime from "./pages/Realtime";
import Collab from "./pages/Collab";

import {BrowserRouter,Route,Routes} from 'react-router'

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Test />} />
        <Route path="/realtime" element={<Realtime />} />
        <Route path="/collab" element={<Collab />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
