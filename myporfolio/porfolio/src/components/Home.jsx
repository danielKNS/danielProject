import React from "react";
import { HiArrowNarrowRight } from "react-icons/hi";
const Home = () => {
  return (
    <div name="home" className=" w-full h-screen bg-[#0a192f]">
      {/* Container */}
      <div className="max-w-[1000px] mx-auto px-8 flex flex-col justify-center h-full ">
        <p className="text-white texy-2xl sm:text-3xl mb-6">Hi, my name is</p>
        <h1 className="text-4xl sm:text-7xl font-bold text-[#ccd6f6]">
          Daniel Rocha Ribeiro
        </h1>
        <h2 className="text-4xl sm:text-7xl font-bold text-[#ccd6f6]">
          I'm a junior Developor
        </h2>
        <p className=" text-gray-300 py-4 max-w-[700px]">
          As a Junior Developer at just 18 years old, I am currently focusing on
          developing my skills as a front-end developer. However, my ultimate
          goal is to become a full-stack developer one day. With a passion for
          coding and a desire to learn and create amazing things, I am excited
          to take on new challenges and develop my expertise in all areas of
          development. While I may be just starting out, I am eager to gain
          experience, and work towards achieving my long-term goals in the field
          of software development.
        </p>
        <div>
          <button className="text-white group border-2 px-7 py-3 my-2 flex items-center hover:bg-indigo-700 hover:border-indigo-700">
            View Projects
            <span className="group-hover:rotate-180 duration-300 px-1">
              <HiArrowNarrowRight className=" ml-3" />
            </span>
          </button>
        </div>
      </div>
    </div>
  );
};

export default Home;
