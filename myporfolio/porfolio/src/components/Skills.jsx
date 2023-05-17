import React from "react";
import react from "../assets/react Icon.png";
import css from "../assets/css Icon.png";
import github from "../assets/github Icon.png";
import html from "../assets/html Icon.png";
import tailwind from "../assets/tailwind Icon.png";
import javascript from "../assets/javascript Icon.png";
import postgrestsql from "../assets/postgreSQL Icon.png";
const Skills = () => {
  return (
    <div name="skills" className=" w-full h-screen bg-[#0a192f] text-gray-300">
      {/* Container */}
      <div className="max-w-[1000px] mx-auto p-4 flex flex-col justify-center w-full h-full">
        <div>
          <p className="text-4xl font-bold inline border-b-4 border-indigo-700 ">
            Experience
          </p>
          <p className="py-4">Thse are languages that i have worked with</p>
        </div>

        <div className="w-full grid grid-cols-2 sm:grid-cols-4 gap-4 text-center py-8">
          <div className="shadow-md shadow-[#040c16] hover:scale-110 duration-500]">
            <img className="w-20 mx-auto" src={html} alt="HTML Icons"></img>
            <p className="my-4">HTML</p>
          </div>
          <div className="shadow-md shadow-[#040c16] hover:scale-110 duration-500]">
            <img className="w-20 mx-auto" src={css} alt="HTML Icons"></img>
            <p className="my-4">CSS</p>
          </div>
          <div className="shadow-md shadow-[#040c16] hover:scale-110 duration-500]">
            <img
              className="w-20 mx-auto"
              src={javascript}
              alt="HTML Icons"
            ></img>
            <p className="my-4">JAVASCRIPT</p>
          </div>
          <div className="shadow-md shadow-[#040c16] hover:scale-110 duration-500]">
            <img className="w-20 mx-auto" src={react} alt="HTML Icons"></img>
            <p className="my-4">REACT</p>
          </div>
          <div className="shadow-md shadow-[#040c16] hover:scale-110 duration-500]">
            <img className="w-20 mx-auto" src={tailwind} alt="HTML Icons"></img>
            <p className="my-4">TAILWIND</p>
          </div>
          <div className="shadow-md shadow-[#040c16] hover:scale-110 duration-500]">
            <img className="w-20 mx-auto" src={github} alt="HTML Icons"></img>
            <p className="my-4">GITHUP</p>
          </div>
          <div className="shadow-md shadow-[#040c16] hover:scale-110 duration-500]">
            <img
              className="w-20 mx-auto"
              src={postgrestsql}
              alt="HTML Icons"
            ></img>
            <p className="my-4">POSTGRESTSQL</p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Skills;
