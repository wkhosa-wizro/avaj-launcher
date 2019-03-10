# Avaj-Launcher
A certain fictional Airport has a bootleneck on their landing track due to frequent weather
changes, they need to find out which scenarios creates the worst bootleneck in order
to come up with a solution to bootleneck. The user creates a scenario file of scenarios tha
need to be analysed and feed this scenario file to the program which generate random
weather conditions to simulate the real the airport environment and gives the results in 
a text file.

# Getting Started
## Prerequisites
- Java must be installed 
  - **``run java -version``** to check if java is available in your machine, if version message
   is displayed then it is installed otheerwise install java.
- Javac must be installed
  - **`` javac  -version``** to check if java compiler is available in your machine, if version
    message is displayed it is installed otherwise instal javac 
- Git command (optional)
 if you don not want to use git you can just download the zipped file of the project
 but the instructions given are for git
### How to build and run the project form source **run the following commands on terminal**
 - clone the project ``git clone https://github.com/wkhosa-wizro/avaj-launcher``
 - change into the cloned directory ``cd avaj-launcher``
 - create a text file with all paths to the .java sources code ``find -name *.java > sources.txt``
 - compile the project ``javac @sources.txt``
 - run the project ``java avaj.app scenario.txt``
 - after running the program the will be an output file ``results.txt``
 
 # Authors
  - [Wisani Khosa](https://github.com/wkhosa-wizro)
