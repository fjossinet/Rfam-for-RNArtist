import io.github.fjossinet.rnartist.core.*      

rnartist {
    ss {
        rfam {
            id = "RF00607"
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
                65 to 68
            }
            value = "#e74573"
        }



        color {
            location {
                5 to 64
            }
            value = "#1cb742"
        }



    }
}           