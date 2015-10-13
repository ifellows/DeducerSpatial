# DeducerSpatial
A Deducer plug-in for spatial data analysis. Includes The ability to plot and explore open street map and Bing satellite images.

# Usage

See: http://www.deducer.org


# Building and installing
Get the released version from CRAN:

```R
install.packages("Deducer")
library(JGR)
launchJGR(jgrArgs="--withPackages=Deducer")
```

To build from this repository

```
sh mkdist
R CMD INSTALL DeducerSpatial_*.*.tar.gz
```