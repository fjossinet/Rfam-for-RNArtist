import io.github.fjossinet.rnartist.core.*      

rnartist {
    ss {
        rfam {
            id = "RF01302"
            name = "consensus"
            use alignment numbering
        }
    }
    theme {
        details { 
            value = 3
        }

        color {
            location {
                1 to 4
                96 to 99
            }
            value = "#e3afe1"
        }



        color {
            location {
                5 to 95
            }
            value = "#c3aa71"
        }



    }
}           