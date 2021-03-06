# WaterSupply-Demo
A demo project using hibernate framework and JavaServer Faces (JSF)


- Each municipality of a country writes down the needs of its citizens in drinking water, delimiting the water supply zones (WSZ). Each municipality can contain many WSZs. 
- Each WSZ has a unique identification element and a basic description. Depending on the quantitative needs, WSZs are named as "normal" (for supplied quantities greater than 1000m3/day or the served population is greater than 5000 citizens). WSZs having smaller needs in quantities or population are named as "small". Each WSZ is also described by geographic coordinates. Finally, each WSZ "is connected" with sources of water supply (SWS). 
- SWSs have an ID, geographic coordinates and indicative supply ability, measurable in m3/hour. For each of these sources are performed water-quality samplings. 
- For each sampling is writing down basic measurements for any parameters. For each measurement is writing down beyond the values of quality parameters (measured value, uncertainty ratio (+- value limit), measurement method, allowable value limit), sampling coordinates, sampling time, time of sampling analysis and the id of the laboratory which made the sampling. Indicative quality parameters are the color, turbidity, smell, pH, conductance, ammonium etc.

In this demo a relational database management system of the above case is described and is given the associated ER diagram. Finally the basic functions of this system are implemented and also web pages for displaying the data.

