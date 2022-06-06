package at.campus02.iwi.pr1;

public class RecordsData {
    public final static int[] GENRES = new int[]
            { 0,2,3,3,3,3,3,3,2,2
                    ,1,3,1,1,2,2,3,0,3,3
                    ,2,3,3,3,2,3,3,2,0,0
                    ,2,3,3,2,0,3,3,0,3,2
                    ,2,2,3,2,3,3,2,2,3,2
                    ,3,0,3,2,3,2,3,2,3,2
                    ,2,3,3,0,0,3,2,3,0,3
                    ,1,0,1,3,3,0,3,3,3,3
                    ,3,3,2,2,2,2,3,3,2,2
                    ,3,3,3,0,3,1,3,1,3,2
                    ,3,3,2,3,0,2,3,3,1,3
                    ,3,1,0,3,3,0,3,3,0,3
                    ,2,3,0,2,0,2,3,1,2,3
                    ,3,3,3,0,1,2,2,2,3,3
                    ,2,3,1,1,2,3,1,3,1,0
                    ,0,3,0,3,1,3,2,3,1,1
                    ,2,3,1,3,3,1,2,3,3,3
                    ,3,0,3,3,2,3,3,0,1,3
                    ,0,0,3,3,3,3,2,0,3,3
                    ,2,3,2,3,1,2,3,3,0,1
            };
    public final static String[] ARTISTS = new String[]
            { "Beastie Boys","2Pac","U2","Green Day","Beck","Soundgarden","U2","Soundgarden","A Tribe Called Quest","Jeff Buckley",
                    "Metallica","Beastie Boys","Metallica","Nine Inch Nails","2Pac","Mariah Carey","Mariah Carey","Pearl Jam","U2","Mariah Carey",
                    "A Tribe Called Quest","U2","Radiohead","The Smashing Pumpkins","Dr. Dre","Radiohead","Green Day","Dr. Dre","Red Hot Chili Peppers","Red Hot Chili Peppers",
                    "Dr. Dre","Mariah Carey","Green Day","R.E.M.","Pearl Jam","Beck","Beastie Boys","Nirvana","Pearl Jam","2Pac",
                    "A Tribe Called Quest","A Tribe Called Quest","R.E.M.","A Tribe Called Quest","Beastie Boys","Mariah Carey","A Tribe Called Quest","2Pac","Green Day","Jeff Buckley",
                    "Soundgarden","Nirvana","Mariah Carey","2Pac","The Smashing Pumpkins","2Pac","The Smashing Pumpkins","Jeff Buckley","Radiohead","A Tribe Called Quest",
                    "A Tribe Called Quest","The Smashing Pumpkins","Alice In Chains","Nirvana","Red Hot Chili Peppers","Soundgarden","Dr. Dre","Radiohead","Pearl Jam","Green Day",
                    "Rage Against The Machine","Pearl Jam","Green Day","Beck","The Smashing Pumpkins","Pearl Jam","Mariah Carey","The Smashing Pumpkins","The Smashing Pumpkins","The Smashing Pumpkins",
                    "The Smashing Pumpkins","Alice In Chains","A Tribe Called Quest","A Tribe Called Quest","A Tribe Called Quest","Jeff Buckley","Radiohead","Green Day","Dr. Dre","Jeff Buckley",
                    "R.E.M.","Beck","Alice In Chains","Pearl Jam","Alice In Chains","Rage Against The Machine","Green Day","Rage Against The Machine","Green Day","A Tribe Called Quest",
                    "Soundgarden","Green Day","Dr. Dre","The Smashing Pumpkins","Red Hot Chili Peppers","U2","R.E.M.","Beck","Rage Against The Machine","Beck",
                    "Beck","Metallica","Nirvana","U2","U2","Nirvana","Mariah Carey","Green Day","Nirvana","Beastie Boys",
                    "Jeff Buckley","Beck","Red Hot Chili Peppers","Jeff Buckley","Red Hot Chili Peppers","Beck","Green Day","Metallica","Jeff Buckley","Green Day",
                    "The Smashing Pumpkins","Beastie Boys","U2","Nirvana","Rage Against The Machine","Mariah Carey","2Pac","2Pac","U2","U2",
                    "Dr. Dre","Beck","U2","Metallica","Dr. Dre","Green Day","Rage Against The Machine","The Smashing Pumpkins","Nine Inch Nails","Pearl Jam",
                    "Red Hot Chili Peppers","U2","Red Hot Chili Peppers","Beastie Boys","Nine Inch Nails","Beastie Boys","Radiohead","U2","Rage Against The Machine","Rage Against The Machine",
                    "A Tribe Called Quest","Alice In Chains","Nine Inch Nails","Beastie Boys","Radiohead","Metallica","2Pac","Beastie Boys","Soundgarden","U2",
                    "Beck","Red Hot Chili Peppers","Soundgarden","Beck","Jeff Buckley","Alice In Chains","R.E.M.","Nirvana","Metallica","Beck",
                    "Red Hot Chili Peppers","Pearl Jam","Beck","U2","The Smashing Pumpkins","R.E.M.","Jeff Buckley","Red Hot Chili Peppers","Mariah Carey","Mariah Carey",
                    "2Pac","Beck","Dr. Dre","R.E.M.","Metallica","Jeff Buckley","R.E.M.","Mariah Carey","Pearl Jam","Nine Inch Nails"};

    public final static double[] LENGTHS = new double[]
            { 62.966366963236645,66.21165488765126,56.629103784682854,13.93984889573979,12.532237059715557,57.97649384095795,61.93724861648266,11.158280957413456,9.636834854537607,12.820409262262428,
                    56.156981553064846,10.753853949990566,53.74601323960023,8.866604759136086,58.6677703942347,60.1894592691612,62.265760152117274,60.597060366849334,67.149936182252,57.72193094443703,
                    55.656797618097485,62.55894397974189,63.98284539458823,52.267180882371534,9.721052075020655,59.237376083149435,59.096241377234286,53.38171693395109,61.245454013107164,56.89591813230584,
                    64.47884784875583,58.168310318384385,10.8507867969393,59.88811526612088,58.54266275226275,57.284890442180874,57.29991267375039,59.46886297551985,60.68400175266318,53.097314593650545,
                    59.17431623069808,61.953705869810456,56.036386871369665,64.07152019886914,63.701003007001326,8.190427683662728,67.37476612011183,66.10202895465025,59.717771083265504,11.20831941423275,
                    63.63007846842736,57.65670850136259,11.947197424562296,60.82913108973906,62.42555600296714,60.00704336285708,59.03570563816036,60.21337962807681,63.350879060579715,54.0395543505399,
                    62.418289107320334,53.02776707630807,65.16551168222263,65.2027850860098,8.071873282316835,6.018442359999515,8.82836963516061,10.597544076723837,59.81700760360151,60.19959365695039,
                    61.44170906845608,61.63259247718639,60.77144345283814,58.31654071831085,65.37581767833973,56.727116154685234,57.3555830727366,7.639617968748167,64.78928792257105,67.53341543166124,
                    11.42844764075935,69.13733341788138,56.49054671283225,53.515650014115174,53.77590528921877,59.782140624874984,52.75488483632782,57.47529912900864,60.78199734110131,58.11358266580869,
                    62.604837383369414,55.47801420199109,56.89061337695153,64.46375381649231,61.69764983531326,12.178618090209227,57.801376396480705,11.042251479017873,56.34097867960456,63.432951141419025,
                    52.397662955026796,55.44968321187545,64.19192889877348,60.99983016327615,61.61274272621982,57.26376299193598,58.67187841413718,58.81559838838582,61.5692322226235,60.966539226219766,
                    61.97103756566319,60.36045116393523,60.82830229621843,11.046926054378563,57.30886086224547,60.53329798999113,9.295503388154621,11.638933216745807,62.08795091842159,12.394519729715942,
                    61.41554004590087,64.19034134967126,58.304415065597,45.94092752359226,60.91432804409162,58.969344962452894,58.953311732030606,9.641240614233467,8.614458846849862,64.5513074625218,
                    58.007707589568696,58.548435544545136,61.055841235823166,57.48143236364395,64.43049871229972,60.7049550092645,55.74882031687788,56.454374928131394,55.64386225905153,63.93646917241105,
                    64.03697812365823,11.426779141039075,64.95608391602575,52.86078445299312,59.26259769343588,54.43522753877372,10.07251948338718,56.742377754567336,60.4634227915723,61.46260578283745,
                    72.4061223363866,63.43501661196767,58.87145943358433,8.048690668655256,60.392746763341,63.62195981275804,13.486077440138649,58.712483236465374,12.235997214789803,64.25699873176073,
                    7.412731441811918,62.7081072461194,9.896605525810873,62.26822548813681,11.23860353260736,59.76549601933694,10.797171453665694,55.78730248021167,53.70167141271638,9.008623605026337,
                    59.52970082806636,61.492480642957105,58.45588491588469,7.538813766638958,52.16691356197907,57.92814925546989,57.1218933376838,59.525535530249144,57.70582431389573,58.46529125662218,
                    61.16653616053622,10.14571396567488,61.71232380422791,55.840848585784315,8.034600639364708,56.78336113623259,60.87010217814138,68.33776676339286,64.0242916871265,55.851540521900986,
                    64.31431640585461,8.962531868987883,9.4369472988867,11.120738664402761,63.02083592526205,55.756436573316336,58.59356126569771,62.35919655513448,56.69415551730628,63.136834504936665};
}
