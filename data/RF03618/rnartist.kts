import io.github.fjossinet.rnartist.core.*      

rnartist {
    ss {
        rfam {
            id = "RF03618"
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
                1 to 23
                42 to 64
            }
            value = "#3cb3b1"
        }



        color {
            location {
                24 to 41
            }
            value = "#3fa2ca"
        }



        color {
            location {
                65 to 66
            }
            value = "#edfc2f"
        }


    }
}           