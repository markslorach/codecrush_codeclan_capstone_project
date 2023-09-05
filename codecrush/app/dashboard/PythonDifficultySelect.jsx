import React from "react";
import { motion, AnimatePresence } from "framer-motion";
import Link from "next/link";

export const PythonDifficultySelect = ({ isOpen, setIsOpen }) => {
  return (
    <main>
      <AnimatePresence>
        {isOpen && (
          <div>
            <motion.div
              className="bg-overlay"
              onClick={() => setIsOpen(false)}
              initial={{ opacity: 0 }}
              animate={{ opacity: 0.5 }}
              exit={{ opacity: 0 }}
              transition={{ duration: 0.7, ease: "easeInOut" }}
            ></motion.div>

            <motion.div
              className="difficulty-select"
              initial={{ y: "100vh", opacity: 0 }}
              animate={{ y: 0, opacity: 1 }}
              exit={{ y: "100vh", opacity: 0 }}
              transition={{ duration: 0.6, ease: "easeInOut" }}
            >
              <div className="p-8 pt-6">
                <button
                  className="pb-5 hover:text-gray-500"
                  onClick={() => setIsOpen(false)}
                >
                  <b>X</b>
                </button>

                <div className="flex flex-col gap-6">
                  <Link href="/beginner">
                    <button className="difficulty-btn hover:bg-green-100">
                      Beginner
                    </button>
                  </Link>
                  <Link href="/intermediate">
                    <button className="difficulty-btn hover:bg-orange-100">
                      Intermediate
                    </button>
                  </Link>
                  <Link href="/advanced">
                    <button className="difficulty-btn hover:bg-red-100">
                      Advanced
                    </button>
                  </Link>
                </div>
              </div>
            </motion.div>
          </div>
        )}
      </AnimatePresence>
    </main>
  );
};
