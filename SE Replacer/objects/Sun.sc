Star	"Sun/Sol"
{
	ParentBody     "Solar System"
	Class          "G2 V"
	Luminosity      1
	LumBol          1
	MassSol         0.99999994
	RadSol          1
	Teff            5778

	Age             4.57

	InertiaMoment   0.0651550293
	Oblateness      9.00000032e-06
	RotationPeriod  609.119878
	RotationEpoch   0
	Obliquity       25.5797787
	EqAscendNode    259.90979

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (1.000 0.876 0.820)

	Surface
	{
		SurfStyle       0.722
		Randomize      (-0.858, 0.931, 0.213)
		colorDistMagn   0
		colorDistFreq   0
		detailScale     3.28e+04
		tropicLatitude  0.7
		icecapLatitude  1
		climatePole     0.448
		climateTropic   0.104
		mareFreq        40.5
		mareDensity     0.00849
		erosion         1
		montesMagn      0.03
		montesFreq      537
		dunesMagn       0.5
		hillsMagn       0.03
		hillsFreq       5.16e+03
		canyonsMagn     0.268
		cracksOctaves   5
		BumpHeight      601
		BumpOffset      601
		SpecBrightWater 0
		SpecBrightIce   0
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.59
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          6957
		Density         0
		Pressure        1
		Bright          10
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      3.41e+06
		Period      0.0206
		Brightness  0.5
		RayDensity  3.12
		RayCurv     17
	}

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Sun-DE"
		Period          0
		SemiMajorAxis   0
		Eccentricity    0
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

