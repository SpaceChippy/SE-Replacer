DwarfPlanet	"Eris/(136199) Eris/2003 UB313"
{
	ParentBody     "Sun"
	Class          "Aquaria"
	Mass            0.0027999999
	Radius          1163
	InertiaMoment   0.399200886
	RotationPeriod  378.528
	RotationEpoch   0
	Obliquity       139
	EqAscendNode    142

	AbsMagn         -1.2
	SlopeParam      0.15
	AlbedoBond      0.6
	AlbedoGeom      0.96
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "custom-temp_aquaria_airless_eris.cfg"
		SurfStyle       0.0574
		Randomize      (-0.169, 0.505, -0.481)
		colorDistMagn   0.0476
		colorDistFreq   115
		detailScale     4.1e+03
		drivenDarkening 0
		seaLevel        0.195
		snowLevel       2
		tropicLatitude  0.743
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.417
		heightTempGrad  0.625
		beachWidth      0.000893
		tropicWidth     0.07
		mainFreq        1.95
		venusFreq       1.28
		venusMagn       0
		mareFreq        0.504
		mareDensity     0.15
		terraceProb     0.229
		erosion         0
		montesMagn      0.0552
		montesFreq      56
		montesSpiky     0.89
		montesFraction  0.813
		dunesMagn       0.0338
		dunesFreq       8.39
		dunesFraction   0.159
		hillsMagn       0.126
		hillsFreq       142
		hillsFraction   0.202
		hills2Fraction  0.00107
		riversMagn      0
		riversFreq      3.4
		riversSin       6.08
		riftsMagn       0
		riftsFreq       2.3
		riftsSin        5.28
		canyonsMagn     0.538
		canyonsFreq     0.428
		canyonsFraction 0
		cracksMagn      0.0569
		cracksFreq      0.248
		cracksOctaves   0
		craterMagn      0.643
		craterFreq      2.58
		craterDensity   0.857
		craterOctaves   18
		craterRayedFactor 0.055
		volcanoMagn     0.177
		volcanoFreq     0.701
		volcanoDensity  0.257
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.292
		volcanoRadius   0.164
		volcanoTemp     254
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.67
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Ecliptic"
		Epoch           2456401
		Period          560.246551
		SemiMajorAxis   67.9581
		Eccentricity    0.437079
		Inclination     43.8851
		AscendingNode   36.031
		ArgOfPericenter 150.804
		MeanAnomaly     203.207
	}
}

