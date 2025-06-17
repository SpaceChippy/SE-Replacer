DwarfPlanet	"Pluto/(134340) Pluto"
{
	ParentBody     "Pluto-Charon"
	Class          "Aquaria"
	AsterType      "Plutino"
	Mass            0.00218000007
	Radius          1183.30005
	RadiusInfo      1.19e+03
	InertiaMoment   0.398847461
	RotationOffset  45
	Obliquity       112.783
	EqAscendNode    223.0539
	TidalLocked     true

	AbsMagn         -0.8
	SlopeParam      0.15
	AlbedoBond      0.72
	AlbedoGeom      0.62
	Brightness      0.5
	BrightnessReal  1
	Color          (0.533 0.440 0.292)

	Surface
	{
		DiffMap        "Pluto/Surface-FGN"
		BumpMap        "Pluto/Bump-SE"
		BumpHeight      10
		BumpOffset      3
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          300
		Density         8.10832425e-05
		Pressure        9.99999975e-06
		Bright          0.5
		Opacity         0.15
		SkyLight        0.01
		Hue             0
		Saturation      1

		Composition
		{
			N2        	99.7
			CH4       	0.25
			CO        	0.05
			C2H2      	3e-06
			C2H4      	1e-06
		}
	}

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
		Period          0.0174876999
		SemiMajorAxis   1.51732727e-05
		Eccentricity    0.003484
		Inclination     112.783
		AscendingNode   223.0539
		ArgOfPericenter 337.92
		MeanAnomaly     56.9861
	}
}

