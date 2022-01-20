import io.github.fjossinet.rnartist.core.*      

rnartist {
    ss {
        rfam {
            id = "RF00349"
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
                1 to 5
                95 to 99
            }
            value = "#c81ef8"
        }



        color {
            location {
                6 to 94
            }
            value = "#477bca"
        }



    }
}           