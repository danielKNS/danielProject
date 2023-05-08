import React from "react";

const About = () => {
  return (
    <div name="about" className=" w-full h-screen bg-[#0a192f] text-gray-300">
      <div className="flex flex-col justify-center items-center w-full h-full">
        <div className="max-w-[1000px] w-full grid grid-cols-2 gap-8">
          {/* Container */}
          <div className="sm:text-right pb-8 pl-4">
            <p className="text-4xl font-bold inline border-b-4 border-indigo-700">
              About
            </p>
          </div>
          <div></div>
        </div>
        <div className="max-w-[1000px] w-full grid grid-cols-2 gap-9 px-4">
          <div className="sm:text-right text-4xl font-bold">
            <p>Hi.I'm Daniel, nice to meet you.Please take a look around!</p>
          </div>
          <div>
            <p>
              Sense little i always loved creating things, but i never imagined
              that i could build websites,apps & more! The moment i found this
              world of coding/programming i was amazed and full of ideas. But i
              never knew creating them is very challeging but when you see you
              build working it gives me an amazing feeling of sastisfaction.
            </p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default About;
